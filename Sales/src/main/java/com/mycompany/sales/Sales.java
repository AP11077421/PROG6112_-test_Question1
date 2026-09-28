/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sales;

/**
 *
 * @author Student
 */
public class Sales {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int[][] sales = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
        String[] products = {"PS5","XBOX", "SWITCH"};
        String[] cities = {"Cape Town","Port Elizabeth", "Pretoria"};
        String cityMaxSales = "";
        int maxSales = sales[0][0];
        
        System.out.println("------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("\n------------------------------------------------------------");
        System.out.printf("%22s %18s %15s", "Cape Town", "Port Elizabeth", "Pretoria");
        for(int x = 0; x < sales.length; x++){
           System.out.printf("\n%15s %8d %10d %10d", cities[x], sales[x][0], sales[x][1], sales[x][2]) ;
        }
        
        System.out.println("\n------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("\n------------------------------------------------------------");
        
        int totalSales = 0;
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++){
                totalSales = totalSales + sales[row][col];
                
                if(maxSales < sales[row][col]){
                    maxSales = sales[row][col];
                    cityMaxSales = cities[row];
                }
            }
            System.out.printf("\n%19s %15s", cities[row], totalSales); 
        }
        System.out.println("");
        System.out.println("\nCITY WITH THE MOST SALES: " + cityMaxSales);
        System.out.println("------------------------------------------------------------");
    }
}
