package Day1;

public class Speaker implements Power, PlayButton, VolumeButton {
    @Override
    public void playThemusic() {

        System.out.println("User play the Music");


    }

    @Override
    public void stopThemusic() {

        System.out.println("User stop the Music");

    }

    @Override
    public void powerOnspeaker() {

        System.out.println("User Switch on the Speaker");

    }

    @Override
    public void powerOfSpeaker() {

        System.out.println("User Switch off the Speaker");

    }

    @Override
    public void increseThevolume() {

        System.out.println("User Increse the Volume");

    }

    @Override
    public void decreseThevolume() {

        System.out.println("User decrese the Volume");

    }
}
