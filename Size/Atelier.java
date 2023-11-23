package Lesson_9.Size;

public class Atelier implements MenClothes, WomanClothes{

    public Atelier() {
    }

    @Override
    public void DressMan() {

    }

    public void DressMan(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof MenClothes){
                System.out.println(clothes[i].value +", " + clothes[i].color +", " + clothes[i].size.euroSize);
            }
        }
    }

    @Override
    public void DressWoman() {

    }

    public void DressWoman(Clothes[] clothes) {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] instanceof WomanClothes){
                System.out.println(clothes[i].value +", " + clothes[i].color +", " + clothes[i].size.euroSize);
            }
        }
    }

}
