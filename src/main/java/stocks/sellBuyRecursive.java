package stocks;

public class sellBuyRecursive {
    //https://www.youtube.com/watch?v=5GgonRFvIMQ&list=PLR0u9sleZ_VAc6sa9nvV-jBelafzw8nqM&index=90
    public static void main(String[] args) {
       // int prices[]={3,3,5,0,0,3,1,4};
        int prices[]={1,2,3,4,5};
        int t=2;
        sellBuy(0,0,2,prices);
        //currState 0-buy , 1-sell
        System.out.println(sellBuy(0,0,2,prices));

    }

    public static int sellBuy(int index,int currState,int t,int[] prices)
    {

        //two possible states- buy , sell
        //for each of the stock price at index i
        //- if we are currently at the buy state
            //we have two choices
              //we can either buy the current stock or skip the current stock
            // we will want to pick the choice that will give us higher profit
        // - if we are currently at sell state
           // we can either sell the current stock or skip the current stock
          // we will want to pick the choice that will give us higher profit
        // Keep track of no of transactions
        // After we have buy->sell we decremt t

        if(index>=prices.length || t==0)
        {
            return 0;

        }
        if(currState==0)
        {
            return Math.max(sellBuy(index+1,1,t,prices)-prices[index],
                                sellBuy(index+1,currState,t,prices));
        }
        else
        { return Math.max(sellBuy(index+1,0,t,prices)+prices[index],
                sellBuy(index+1,currState,t,prices));

        }
    }
}
