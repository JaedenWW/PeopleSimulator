class Crime{
   public double percent;
    public String name;
    public int punish;

    public Crime(String name, int punish, double percent){
        this.name = name;
        this.punish = punish;
        this.percent = percent;
    }
    public String cName(){
        return name;
    }
    public double likelyhood(){
        return percent;
    }
    public int sentence(){
        return punish;
    }

}