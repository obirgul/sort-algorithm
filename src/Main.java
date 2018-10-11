public class Main {

    public static void main(String[] args) {

        int a[]={8,3,6,15,82,33,897789,5,3,8,1,2,677667};

        SelectionSort(a);
        System.out.print("Selection Sort : ");
        for(int b = 0;b<a.length;b++)
            System.out.print(a[b]+" ");
        System.out.println();

        BubbleSort(a);
        System.out.print("Bubble sort: ");
        for(int b = 0;b<a.length;b++)
            System.out.print(a[b]+" ");
        System.out.println();

        InsertionSort(a);
        System.out.print("Insertion sort: ");
        for(int b = 0;b<a.length;b++)
            System.out.print(a[b]+" ");
        System.out.println();

        sort(a,0,12);
        System.out.print("Quick sort: ");
        for(int b = 0;b<a.length;b++)
            System.out.print(a[b]+" ");
        System.out.println();
    }

    public static void SelectionSort (int[] arr){
        // arr, sıralanacak dizi ; n, array length
        for (int i=0; i<(arr.length-1); i++) {//i index
            int min = i;
            for (int j = i; j <= arr.length-1; j++) {//en kucuk elemanı bul
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //min ile i'inci elementi yer değiştirme işlemi
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }
    }

    public static void BubbleSort (int[] arr){

        for (int i=0; i<(arr.length-1); i++) {
            for (int j=0; j>(arr.length-1); j++){ //j yan yana elemanları karşılaştırmak için
                if (arr[j] > arr[j+1]) {//yan yana elemeanlardan hangisi büyükse yer değiştiriyor
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void InsertionSort (int[] arr){

        for (int i=1; i<arr.length; i++){
            int j,x = arr[i];//diziyi birbirinden ayırmak için tanımlandı
            for (j=i-1;arr[j]>x;j--) {
                arr[j + 1] = arr[j];
                if(j==0)break;
            }
            arr[j+1]=x;
        }


    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

}
