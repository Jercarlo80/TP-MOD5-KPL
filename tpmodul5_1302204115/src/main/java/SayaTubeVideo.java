/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author jeremiacarlo
 */
public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;

    public SayaTubeVideo(String title) {
        if (title != null) {
            System.out.println("Input null");
        } else if (title.length() <= 100) {
            System.out.println("Input terlalu panjang!");
        }
        Random random = new Random();

        this.id = random.nextInt(99999);
        this.title = title;
        this.playCount = 0;
    }

    public void IncreasePlayCount(int x) {
        playCount++;
        try {
            this.playCount += x;
        }
        catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }

    public void PrintVideoDetails() {
        System.out.println("ID: "+id);
        System.out.println("Title: "+title);
        System.out.println("PlayCount: "+playCount);
    }

    public static void main(String[] args) {
        SayaTubeVideo data = new SayaTubeVideo("Tutorial Desaign by Jeremia Carlo Christianto Silitonga: ");
        data.PrintVideoDetails();
        int i = 0;
        while (i < 1) {
            data.IncreasePlayCount(0);
            i++;
        }
        data.PrintVideoDetails();
    }

}
