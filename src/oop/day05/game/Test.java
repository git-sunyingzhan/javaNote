package oop.day05.game;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Role r = new Role(2137, "李逍遥", 100);
        Weapon weapon = new Weapon("屠龙刀", 9999);
        r.setWeapon(weapon);// 装备武器
        r.plysicalAttack();
        Armour armour = new Armour("麒麟甲", 10000);
        r.setArmour(armour);// 装备防具
        r.defense();

        // 加载技能
        r.setShill(new Shill() {
            @Override
            public void releaseShill() {
                System.out.println("飞龙在天");
            }
        });

        r.magicAttack();

        // 更换技能
        r.setShill(new Shill() {

            @Override
            public void releaseShill() {
                System.out.println("亢龙有悔");
            }
        });

        r.magicAttack();
    }
}