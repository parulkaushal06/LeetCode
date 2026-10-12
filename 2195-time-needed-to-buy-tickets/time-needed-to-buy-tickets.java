class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length; i++){
            q.offer(i);
        }
        int time = 0 ;
        while(tickets[k]>0){
            int idx = q.poll();
            tickets[idx]--;
            time++;
            if(idx == k && tickets[k]==0){
                return time ;
            }
            if(tickets[idx]!=0){
                q.offer(idx);
            }
        }
        return time ;
    }
}