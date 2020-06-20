
public class Calculation extends Neuron{
    
    public void getInput(int w, int x, int y, int z){
        this.in1 = w;        this.in2 = x;
        this.in3 = y;        this.in4 = z;
    }
    
    public void getWeights(double w1, double w2, double w3, double w4){
        this.w1 = w1;        this.w2 = w2;
        this.w3 = w3;        this.w4 = w4;
    } 
    
    //Calculate the total weighted sum
    public double calcWeightedSum(){        
    
        double wSum1 = in1 * w1;        double wSum2 = in2 * w2;
        double wSum3 = in3 * w3;        double wSum4 = in4 * w4;
        
        weightedSum = wSum1 + wSum2 + wSum3 + wSum4;
        return weightedSum;        
    }
    
    //Display output
    public String output(){                       
        if (weightedSum > threshold) {
            System.out.println(in1 + "  "+ in2 + "  " + in3 + "  " + in4 + "  ->  1");           
        }
        else{
            System.out.println(in1 + "  "+ in2 + "  " + in3 + "  " + in4 + "  ->  0");            
        }       
        return null;       
    }
    
}
