import java.util.Stack;

public class solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(asteroids[i] > 0){
                st.push(asteroids[i]);
            }
            else{
                while((!st.isEmpty()) && (st.peek() > 0) && (Math.abs(asteroids[i]) > st.peek())){
                    st.pop();
                }
                if((!st.isEmpty()) && (st.peek() == Math.abs(asteroids[i]))){
                    st.pop();
                }
                else if((!st.isEmpty()) && (st.peek() < Math.abs(asteroids[i]))){
                    st.push(asteroids[i]);
                }
                else if(st.isEmpty()){
                    st.push(asteroids[i]);
                }
            }

        }

        int[] ans = new int[st.size()];
        int i = st.size() - 1;
        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }

        return ans;
    }
}