//Merge 2 sorted list

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //TC: O(n) --n is num of total elements in both lists
        //SC: O(1)
        
        if(list1 == null && list2 == null){
            return list1;
        }
        
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        ListNode ansListHead = null; 
        ListNode ansList = null;
        
        while(list1 != null && list2 != null){
            
            if(list1.val <= list2.val){
                
                if(ansListHead == null){
                    
                    ansListHead = list1;
                    ansList = ansListHead;
                    
                    list1 = list1.next;
                    
                }else{
                    ansList.next = list1;
                    ansList = ansList.next;
                    
                    list1 = list1.next;
                }
            }else{
                
                if(ansListHead == null){
                    ansListHead = list2;
                    ansList = ansListHead;
                    
                    list2 = list2.next;
                    
                }else{
                    ansList.next = list2;
                    ansList = ansList.next;
                    
                    list2 = list2.next;
                }
            }
        }
        
        if(list1 != null){ //if any list is larger than the other
            ansList.next = list1;

        }else if(list2 != null){
            ansList.next = list2;
        }
        
        return ansListHead;
    }
}