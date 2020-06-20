
public class Main {
    
    public static void main(String[] args) {
        
        Neuron n = new Neuron();    //Instantiation
        Calculation cal = new Calculation();
        
        System.out.println("Threshold value : " + n.threshold);        
        
        cal.getWeights(0.2, 0.2, 0.2, 0.1);   //Assign values for connection weights
        
        System.out.println("Connection Weights : " + cal.w1 + ", " + cal.w2 + ", " + cal.w3 + ", " + cal.w4);
        
        System.out.println("");
        System.out.println("i1 i2 i3 i4 -> output");  
        System.out.println("");
                
        //Possible input combinations
        cal.getInput(0,0,0,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,0,0,1);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,0,1,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,0,1,1);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,1,0,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,1,0,1);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,1,1,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(0,1,1,1);    cal.calcWeightedSum();    cal.output();
        
        cal.getInput(1,0,0,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(1,0,0,1);    cal.calcWeightedSum();    cal.output();
        cal.getInput(1,0,1,0);    cal.calcWeightedSum();    cal.output();
        cal.getInput(1,0,1,1);    cal.calcWeightedSum();    cal.output(); 
        cal.getInput(1,1,0,0);    cal.calcWeightedSum();    cal.output(); 
        cal.getInput(1,1,0,1);    cal.calcWeightedSum();    cal.output(); 
        cal.getInput(1,1,1,0);    cal.calcWeightedSum();    cal.output(); 
        cal.getInput(1,1,1,1);    cal.calcWeightedSum();    cal.output(); 
        
    }
    
}
