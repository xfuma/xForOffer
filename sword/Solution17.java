package sword;

/**
 * 合并两个排序的链表
 * 
 * @author xhy
 *
 */
public class Solution17 {
	public ListNode merge(ListNode head1, ListNode head2) {
		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		ListNode mergedHead = null;
		if (head1.val < head2.val) {
			mergedHead = head1;
			mergedHead.next = merge(head1.next, head2);
		} else {
			mergedHead = head2;
			mergedHead.next = merge(head1, head2.next);
		}
		return mergedHead;
	}
}