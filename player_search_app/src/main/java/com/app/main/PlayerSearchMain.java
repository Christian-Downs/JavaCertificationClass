package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.imp.PlayerSearchServiceImpl;

public class PlayerSearchMain{
	public static void main(String[] args) {
		int choice = 0;
		Scanner scn = new Scanner(System.in);
		PlayerSearchServiceImpl playerSearchService = new PlayerSearchServiceImpl();
		
		System.out.println("PlayerSearch V1.0");
		System.out.println("-----------------");
		
		System.out.println("1)By Id");
		System.out.println("2)By Contact Number");
		System.out.println("3)By Age");
		System.out.println("4)By Gender");
		System.out.println("5)By TeamName");
		System.out.println("6)By Dob");
		System.out.println("7)By Player Name");
		System.out.println("8)Show All Players");
		System.out.println("9)EXIT");

		try {
			choice = Integer.parseInt(scn.nextLine());
		}
		catch(NumberFormatException e) {
			
		}
		switch(choice) {
		case 1:
			System.out.println("Enter id to seach");
			try {
				int id = Integer.parseInt(scn.nextLine());
				
				Player player = playerSearchService.getPlayerById(id);
				
				if(player!=null) {
					System.out.println(player.toString() + " found");
				}
				else
				{
					System.out.println("NothingReturned");
				}
			} catch(NumberFormatException e) {
				System.out.println(e);
			}
			catch(BusinessException e) {
				System.out.println(e);
			}
			
			break;
		case 2:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 3:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 4:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 5:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 6:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 7:
			System.out.println("Thank you this is still underDevelopment");
			break;
		case 8:
			try {
				List<Player> allPlayersList = playerSearchService.getAllPlayers();
				if(allPlayersList!=null && allPlayersList.size()>0) {
					
				}
			}
			catch (BusinessException e) {
				System.out.println(e.getMessage());
			}
			break;
		case 9:
			System.out.println("Thank you this is still underDevelopment");
			break;
		default:
			
			break;
		}
		
	}
}
