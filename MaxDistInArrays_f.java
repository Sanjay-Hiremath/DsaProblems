class MaxDistInArrays_f {
    public int maxDistance(List<List<Integer>> arrays) {
        
        List<Integer> maxList= new ArrayList<Integer>();
        List <Integer> minList= new ArrayList<Integer>();
    for(List<Integer> list:arrays){
        maxList.add(Collections.max(list));
        minList.add(Collections.min(list));
    }

    Integer max= Collections.max(maxList);
    Integer min =Collections.min(minList);
    int ret=(int)min-max;
    return Math.abs(ret);
    }
}