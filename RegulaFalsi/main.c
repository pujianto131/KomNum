#include <stdio.h>
#include <conio.h>
#define size 99
void sort(int[], int);
main(){
    // clrscr();
    int x[size],i,n,uang,hasil[size];
                printf("\n BanyakKoin:");
    scanf("%d", &n);
                printf("\n \n MasukanJenisKoin : \n");
    for(i=1;i<=n;i++){
        scanf("%d", &x[i]);
    }
    sort(x,n);
    printf("\n Koin yang tersedia \n :");
    for(i=1;i<=n;i++){
        printf("%d", x[i]);
        printf("\n");
    }
    printf("\n");
    printf("\n MasukanNilai yang dipecah:");
    scanf("%d", &uang);
    printf("\n");
    for(i=1;i<=n;i++){
        hasil[i]=uang/x[i];
        uang=uang%x[i];
    }
    for(i=1;i<=n;i++){
        printf("keping %d", x[i]);
        printf("-an sebanyak : %d", hasil[i]);
        printf("\n\n");
    }
    //getch();
    //return 0;
}
void sort(int a[], int siz){
    int pass,j,hold;
    for(pass=1;pass<=siz-1;pass++){
        for(j=0;j<=siz-2;j++){ 
            if(a[j+1]<a[j+2]){
                hold=a[j+1];
                a[j+1]=a[j+2];
                a[j+2]=hold;
            }
        }
    }
}