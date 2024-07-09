package inheritence;

class Amount{
    protected double p=100000,t=5;
}
class Simple_Interest extends Amount{
    private double si,r=6;
    public void calSI(){
        si = (p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }

}
class compound_interest extends Amount{
    private double r = 6,ci;
    public void calCI(){
        ci = (p*Math.pow((1+r/100),t));
        System.out.println("Compound Interest: "+ci);
    }
}
class hierarchical_inheritence_main{
    public static void main(String[] args) {
        Simple_Interest si = new Simple_Interest();
        compound_interest ci = new compound_interest();

        si.calSI();
        ci.calCI();
    }
}