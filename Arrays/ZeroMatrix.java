class Main {
    public static void main(String[] args) {
        int[][] arr={
            {0,0,0},
            {0,0,0},
            {0,0,0}
        };
        boolean zeros=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]!=0){
                    zeros=false;
                    break;
                }
            }
        }if(zeros){
            System.out.println("Is a Zeros Matrix");
        }else{
            System.out.println("Not a Zeros Matrix");
        }
    }
}
