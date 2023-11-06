import java.util.concurrent.ThreadLocalRandom;

public class SelectSort {
    int[] array;

    SelectSort (int size) {
        this.array = new int[size];
        for (int i = 0; i < size-1; i++) {
            this.array[i] = ThreadLocalRandom.current().nextInt(-1000, 1000);
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Индекс [" + i + "]: " + array[i]);
        }
    }

    //Метод сортировки выбором
    public void selectSort() {
        //Индекс минимального элемента в текущем проходе
        int minElementIndex;
        int temp;
        //Внешний прямой цикл
        for (int i = 0; i < array.length - 1; i++) {
            //Предполагаем, что элемент стоящий первым в текущем проходе - минимальный. (По индексу)
            minElementIndex = i;
            //Во внутреннем цикле сравниваем каждый последующий элемент с минимальным элементом на текущий момент
            for (int j = i+1; j < array.length; j++) {
                //Если был найден очередной элемент, который меньше минимального, то заменяем индекс в переменной minElementIndex
                if(array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            //После внутреннего цикла меняем элементы местами
            temp = array[i];
            array[i] = array[minElementIndex];
            array[minElementIndex] = temp;
            //Таким образом, каждый проход находит и передвигает минимальный элемент на место i (текущая позиция итератора)
        }
    }


}
