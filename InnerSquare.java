public class InnerSquare{
    public static void main(String[] args) {
        int width = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        for(int i = 0; i < height; i++){
            if(i == 0 || i == height - 1){
                for(int w = 0; w < width; w++){
                    System.out.print("#");
                }
                System.out.println("");
            }
            else{
                for(int w2 = 0; w2 < width; w2++){
                    if(w2 == 0 || w2 == width - 1){
                        System.out.print("#");
                    }
                    else if(height - 2 > 1 && i + 2 < height && i > 1 && width - 2 > 1 && w2 + 2 < width && w2 > 1){ // Messy if-statement that makes the inner rectangle by printing each # individually
                        if(i - 3 >= 0 && w2 - 3 >= 0 && i + 3 < height && w2 + 3 < width){ // Makes empty spaces by checking distance to the sides of the rectangle
                            System.out.print(" ");
                        }
                        else{
                            System.out.print("#");
                        }
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}