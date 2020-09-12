package kakao2019.길찾기게임;

import java.util.ArrayList;
import java.util.Collections;

public class Solution_tk {
	class Solution {
		int idx = 0;
		
		
	    public int[][] solution(int[][] nodeinfo) {
	    	ArrayList<Node> list = new ArrayList<>();
	    	for(int i = 0; i < nodeinfo.length; i++)
	    		list.add(new Node(i + 1, nodeinfo[i][1], nodeinfo[i][0]));
	    	Collections.sort(list);
	    	Node root = list.get(0);
	    	int[][] answer = new int[2][list.size()];
	    	
	    	for(int i = 1; i < list.size(); i++)
	    		add(root, list.get(i));
	    		
	    	preorder(answer, root);
	    	idx = 0;
	    	postorder(answer, root);
	    	return answer;
	    }
	    
	    
	    public void add(Node parent, Node cur) {
	    	if(parent.x > cur.x) {
	    		if(parent.left == null) {
	    			parent.left = cur;
	    		}
	    		else {
	    			add(parent.left, cur);
	    		}
	    	}
	    	else {
	    		if(parent.right == null) {
	    			parent.right = cur;
	    		}
	    		else {
	    			add(parent.right, cur);
	    		}
	    	}
	    }
	    
	    
	    public void preorder(int[][] answer, Node root) {
	    	if(root != null) {
	    		answer[0][idx++] = root.idx;
	    		preorder(answer, root.left);
	    		preorder(answer, root.right);
	    	}
	    }
	    
	    
	    public void postorder(int[][] answer, Node root) {
	    	if(root != null) {
	    		postorder(answer, root.left);
	    		postorder(answer, root.right);
	    		answer[1][idx++] = root.idx;
	    	}
	    }
	    
	    
	    class Node implements Comparable<Node> {
			int idx, y, x;
			Node right;
			Node left;
			
			Node(int idx, int y, int x) {
				this.idx = idx;
				this.y = y;
				this.x = x;
			}

			@Override
			public int compareTo(Node o) {
				if(this.y == o.y) return this.x - o.x;
				return o.y - this.y;
			}
		}
	}
}