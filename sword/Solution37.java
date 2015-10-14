package sword;

/**
 * 两个链表的第一个公共结点
 * 
 * @author xhy
 *
 */
public class Solution37 {
	public static ListNode findFirstCommonNode(ListNode head1, ListNode head2) {
		int len1 = getListLen(head1);
		int len2 = getListLen(head2);
		int lenDif;
		ListNode nLong;
		ListNode nShort;
		if (len1 > len2) {
			nLong = head1;
			nShort = head2;
			lenDif = len1 - len2;
		} else {
			nShort = head1;
			nLong = head2;
			lenDif = len2 - len1;
		}
		for (int i = 0; i < lenDif; i++) {
			nLong = nLong.next;
		}
		while (nLong != null && nShort != null && nLong != nShort) {
			nLong = nLong.next;
			nShort = nShort.next;
		}
		return nLong;
	}

	private static int getListLen(ListNode head) {
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return len;
	}
}