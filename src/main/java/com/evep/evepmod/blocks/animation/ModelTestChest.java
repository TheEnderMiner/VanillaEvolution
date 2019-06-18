//package com.evep.evepmod.blocks.animation;
//
//import net.minecraft.client.model.ModelBase;
//import net.minecraft.client.model.ModelRenderer;
//import net.minecraft.entity.Entity;
//
//
//public class ModelTestChest extends ModelBase {
//    public ModelRenderer HangyThingy;
//    public ModelRenderer Top;
//    public ModelRenderer Bottom;
//
//    public ModelTestChest() {
//        this.textureWidth = 64;
//        this.textureHeight = 64;
//        this.HangyThingy = new ModelRenderer(this, 0, 0);
//        this.HangyThingy.setRotationPoint(8.0F, 7.0F, 15.0F);
//        this.HangyThingy.addBox(-1.0F, -2.0F, -15.0F, 2, 4, 1, 0.0F);
//        this.Bottom = new ModelRenderer(this, 0, 19);
//        this.Bottom.setRotationPoint(1.0F, 6.0F, 1.0F);
//        this.Bottom.addBox(0.0F, 0.0F, 0.0F, 14, 10, 14, 0.0F);
//        this.Top = new ModelRenderer(this, 0, 0);
//        this.Top.setRotationPoint(1.0F, 7.0F, 15.0F);
//        this.Top.addBox(0.0F, -5.0F, -14.0F, 14, 5, 14, 0.0F);
//    }
//
//    public void renderAll(){
//    	this.HangyThingy.rotateAngleX = this.Top.rotateAngleX;
//    	this.Top.render(0.0625f);
//    	this.HangyThingy.render(0.0625f);
//    	this.Bottom.render(0.0625f);
//    }
//
//   
//}
