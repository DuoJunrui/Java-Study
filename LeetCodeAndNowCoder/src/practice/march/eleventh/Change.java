package practice.march.eleventh;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int change = 1024 - money;
		int coin64 = change/64;
		int coin16 = (change-coin64*64)/16;
		int coin4 = (change-coin64*64-coin16*16)/4;
		int coin1 = (change-coin64*64-coin16*16-coin4*4)/1;

		if (money>0 && money<=1024) {
			System.out.print("花"+money+",需要找零"+change+"块");
			if (coin64!=0) {
				System.out.print("，"+coin64+"个64元硬币");
			}
			if (coin16!=0) {
				System.out.print("，"+coin16+"个16元硬币");
			}
			if (coin4!=0) {
				System.out.print("，"+coin4+"个4元硬币");
			}
			if (coin1!=0) {
				System.out.print("，"+coin1+"个1元硬币");
			}
			System.out.println("即可。");
		}else {
			System.out.println("您输入的金额有误。");
		}
		
		
	}

}

