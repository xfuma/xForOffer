package sword;

/**
 * 反转链表
 * 
 * @author xhy
 *
 */
public class Solution16 {
	public ListNode reverseList(ListNode head) {
		ListNode reHead = null;
		ListNode node = head;
		ListNode pre = null;
		ListNode next = null;
		while (node != null) {
			if (node.next == null)
				reHead = node;
			next = node.next;
			node.next = pre;
			pre = node;
			node = next;
		}
		return reHead;
	}
}