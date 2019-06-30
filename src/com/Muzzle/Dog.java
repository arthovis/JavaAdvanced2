package com.Muzzle;

public class Dog {
    private Muzzle muzzle;

    public Dog(){
        muzzle = new Muzzle("leather","black");
    }

    public void  showAttr(){
        System.out.println(muzzle.getMaterial());
        System.out.println(muzzle.getColor());
    }

}
