package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
          "applicationContext.xml"
        );

        //Music music = context.getBean("musicBean", Music.class);

       // MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println("Player name: " + musicPlayer.getName());
        System.out.println("Volume: " + musicPlayer.getVolume());



        context.close();
    }

}
