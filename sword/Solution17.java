package sword;

/**
 * 合并两个排序的链表
 * 
 * @author xhy
 *
 */
public class Solution17 {
	public ListNode merge(ListNode list1, ListNode list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;
		ListNode mergedHead = null;
		if (list1.val < list2.val) {
			mergedHead = list1;
			mergedHead.next = merge(list1.next, list2);
		} else {
			mergedHead = list2;
			mergedHead.next = merge(list1, list2.next);
		}
		return mergedHead;
	}
}