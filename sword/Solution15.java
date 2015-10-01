package sword;

/**
 * 链表中倒数第k个结点
 * 
 * @author xhy
 *
 */
public class Solution15 {
	// 迭代实现，时间O(n)，空间O(1)
	public ListNode findKthToTail(ListNode head, int k) throws Exception {
		if (k <= 0 || head == null)
			throw new Exception("输入有误");
		ListNode p1 = head;
		ListNode p2 = head;
		for (int i = 0; i < k - 1; i++) {
			if (p2.next == null)
				throw new Exception("长度不足");
			p2 = p2.next;
		}
		while (p2.next != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}

	// 递归实现，空间O(n)
	public ListNode findKthToTail2(ListNode head, int k, IntWrapper i) {
		if (head == null)
			return null;
		ListNode node = findKthToTail2(head.next, k, i);
		i.val++;
		if (i.val == k)
			return head;
		return node;
	}

	class IntWrapper {
		int val = 0;
	}
}
