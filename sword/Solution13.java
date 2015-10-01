package sword;

/**
 * 在O(1)时间删除链表结点
 * 
 * @author xhy
 *
 */
public class Solution13 {
	public void deleteNode(ListNode head, ListNode toBeDeleted) {
		if (head == null || toBeDeleted == null)
			return;
		if (toBeDeleted.next != null) {
			toBeDeleted.val = toBeDeleted.next.val;
			toBeDeleted.next = toBeDeleted.next.next;
		} else if (head == toBeDeleted)
			head = null;
		else {
			ListNode node = head;
			while (node.next.next != null)
				node = node.next;
			node.next = null;
		}
	}
}