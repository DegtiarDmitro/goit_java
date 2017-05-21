package module_2;

/**
 * Created by dimas on 20.05.17.
 */
public class Task_1 {


    public static void main(String[] args){


        int[] _arrInt = {-3, 8, 18, -9, 11};
        double[] _arrDoble = {30.7, 8.3, 18.5, -9.1, 11.2};

        Task_1 task_1 = new Task_1();

        System.out.println("sum: " + task_1.sum(_arrInt));
        System.out.println("sum: " + task_1.sum(_arrDoble));

        System.out.println("min: " + task_1.min(_arrInt));
        System.out.println("min: " + task_1.min(_arrDoble));

        System.out.println("max: " + task_1.max(_arrInt));
        System.out.println("max: " + task_1.max(_arrDoble));

        System.out.println("maxPositive: " + task_1.maxPositive(_arrInt));
        System.out.println("maxPositive: " + task_1.maxPositive(_arrDoble));

        System.out.println("multiplication: " + task_1.multiplication(_arrInt));
        System.out.println("multiplication: " + task_1.multiplication(_arrDoble));

        System.out.println("modulusFirstElem: " + task_1.modulusFirstElem(_arrInt));
        System.out.println("modulusFirstElem: " + task_1.modulusFirstElem(_arrDoble));

        System.out.println("modulusLastElem: " + task_1.modulusLastElem(_arrInt));
        System.out.println("modulusLastElem: " + task_1.modulusLastElem(_arrDoble));

        System.out.println("secondLargest: " + task_1.secondLargest(_arrInt));
        System.out.println("secondLargest: " + task_1.secondLargest(_arrDoble));



    }


    /**
     * sum
     * @param array
     * @return
     */
    private int sum(int array[]){
        int summa = 0;
        for(int i = 0; i < array.length; ++i){
            summa += array[i];
        }
        return summa;
    }
    private double sum(double array[]){
        double summa = 0;
        for(int i = 0; i < array.length; ++i){
            summa += array[i];
        }
        return summa;
    }


    /**
     * min
     * @param array
     * @return
     */
    private int min(int array[]){
        int minVal = array[0];
        for(int i = 1; i < array.length; ++i){
            if(minVal > array[i]){
                minVal = array[i];
            }
        }
        return minVal;
    }
    private double min(double array[]){
        double minVal = array[0];
        for(int i = 1; i < array.length; ++i){
            if(minVal > array[i]){
                minVal = array[i];
            }
        }
        return minVal;
    }


    /**
     * max
     * @param array
     * @return
     */
    private int max(int array[]){

        int maxVal = array[0];
        for(int i = 1; i < array.length; ++i){
            if(maxVal < array[i]){
                maxVal = array[i];
            }
        }
        return maxVal;

    }
    private double max(double array[]){
        double maxVal = array[0];
        for(int i = 1; i < array.length; ++i){
            if(maxVal < array[i]){
                maxVal = array[i];
            }
        }
        return maxVal;
    }


    /**
     * maxPositive
     * @param array
     * @return
     */
    private int maxPositive(int array[]){
        int maxPozVal = -1;
        for(int i = 0; i < array.length; ++i){
            if(maxPozVal < array[i]){
                maxPozVal = array[i];
            }
        }
        return maxPozVal;
    }
    private double maxPositive(double array[]){
        double maxPozVal = 0;
        boolean finded = false;
        for(int i = 0; i < array.length; ++i){
            if(maxPozVal < array[i]){
                maxPozVal = array[i];
                finded = true;
            }
        }
        return finded ? maxPozVal : -1;
    }


    private int multiplication  (int array[]){
        int multi = 1;
        for(int i = 0; i < array.length; ++i){
            multi *= array[i];
        }
        return multi;
    }
    private double multiplication (double array[]){
        double multi = 1;
        for(int i = 0; i < array.length; ++i){
            multi *= array[i];
        }
        return multi;
    }

    private int modulusFirstElem(int array[]){
        return Math.abs(array[0]);
    }
    private double modulusFirstElem(double array[]){
        return Math.abs(array[0]);
    }
    private int modulusLastElem(int array[]){
        return Math.abs(array[array.length - 1]);
    }
    private double modulusLastElem(double array[]){
        return Math.abs(array[array.length - 1]);
    }


    private int secondLargest(int array[]){
        int secMaxVal = array[0], maxVal = array[0];

        for(int i = 1; i < array.length; ++i){
            if(array[i] > maxVal){
                secMaxVal = maxVal;
                maxVal = array[i];
            }else if(secMaxVal == maxVal && array[i] < maxVal){
                secMaxVal = array[i];
            }else if(array[i] < maxVal && array[i] > secMaxVal){
                secMaxVal = array[i];
            }
        }
        return secMaxVal;
    }

    private double secondLargest(double array[]){
        double secMaxVal = array[0], maxVal = array[0];
        for(int i = 1; i < array.length; ++i){
            if(array[i] > maxVal){
                secMaxVal = maxVal;
                maxVal = array[i];
            }else if(secMaxVal == maxVal && array[i] < maxVal){
                secMaxVal = array[i];
            }else if(array[i] < maxVal && array[i] > secMaxVal){
                secMaxVal = array[i];
            }
        }

        return secMaxVal;
    }




}
