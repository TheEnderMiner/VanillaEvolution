package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElementArmor extends ModelBiped {
    public ModelRenderer WaterHelmet;
    public ModelRenderer WaterHelmet2;
    public ModelRenderer WaterHelmet3;
    public ModelRenderer WaterHelmet4;
    public ModelRenderer WaterHelmet5;
    public ModelRenderer WaterHelmet6;
    public ModelRenderer WaterHelmet6_1;
    public ModelRenderer EarthChestplate;
    public ModelRenderer EarthChestplate2;
    public ModelRenderer EarthChestplate3;
    public ModelRenderer EarthChestplate4;
    public ModelRenderer EarthChestplate5;
    public ModelRenderer EarthChestplate6;
    public ModelRenderer EarthChestplate7;
    public ModelRenderer EarthChestplate8;
    public ModelRenderer EarthChestplate9;
    public ModelRenderer EarthChestplate10;
    public ModelRenderer EarthChestplate11;
    public ModelRenderer EarthChestplate12;
    public ModelRenderer EarthChestplate13;
    public ModelRenderer EarthChestplate14;
    public ModelRenderer EarthChestplate15;
    public ModelRenderer FireLeggings;
    public ModelRenderer FireLeggings2;
    public ModelRenderer FireLeggings3;
    public ModelRenderer FireLeggings4;
    public ModelRenderer FireLeggings5;
    public ModelRenderer FireLeggings6;
    public ModelRenderer AirBoots;
    public ModelRenderer AirBoots2;
    public ModelRenderer AirBoots3;
    public ModelRenderer AirBoots4;
    public ModelRenderer AirBoots5;
    public ModelRenderer AirBoots6;
    public ModelRenderer AirBoots7;
    public ModelRenderer AirBoots8;

    public ModelElementArmor() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.WaterHelmet = new ModelRenderer(this, 0, 70); //
        this.WaterHelmet.setRotationPoint(-3.0F, -8.0F, -4.0F); //
        this.WaterHelmet.addBox(-1.0F, -1.0F, 0.0F, 8, 1, 8, 0.0F); //
        
        this.AirBoots8 = new ModelRenderer(this, 0, 98); //
        this.AirBoots8.setRotationPoint(-2.0F, 12.0F, -2.0F); //
        this.AirBoots8.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F); //
        
        this.AirBoots6 = new ModelRenderer(this, 6, 96); //
        this.AirBoots6.mirror = true; //
        this.AirBoots6.setRotationPoint(2.0F, 8.0F, -2.0F); //
        this.AirBoots6.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F); //
        
        this.WaterHelmet2 = new ModelRenderer(this, 0, 70); //
        this.WaterHelmet2.setRotationPoint(-4.0F, -7.0F, -4.0F); //
        this.WaterHelmet2.addBox(-1.0F, -1.0F, 0.0F, 1, 4, 8, 0.0F); //
        
        this.WaterHelmet5 = new ModelRenderer(this, 4, 73); //
        this.WaterHelmet5.setRotationPoint(5.0F, -7.0F, -3.9F); //
        this.WaterHelmet5.addBox(-1.0F, -1.0F, 0.0F, 1, 4, 8, 0.0F); //
        
        this.WaterHelmet4 = new ModelRenderer(this, 0, 78); //
        this.WaterHelmet4.setRotationPoint(-3.0F, -7.0F, 4.0F); //
        this.WaterHelmet4.addBox(-1.0F, -1.0F, 0.0F, 8, 5, 1, 0.0F); //
        
        this.WaterHelmet6 = new ModelRenderer(this, 6, 80); //
        this.WaterHelmet6.setRotationPoint(-3.0F, -7.0F, -5.0F); //
        this.WaterHelmet6.addBox(-1.0F, -1.0F, 0.0F, 8, 3, 1, 0.0F); //
        
        this.AirBoots7 = new ModelRenderer(this, 0, 98); //
        this.AirBoots7.setRotationPoint(-2.0F, 12.0F, -2.0F); //
        this.AirBoots7.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F); //
        
        this.AirBoots5 = new ModelRenderer(this, 4, 96); //
        this.AirBoots5.setRotationPoint(-3.0F, 8.0F, -2.0F); //
        this.AirBoots5.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4, 0.0F); //
        
        this.AirBoots4 = new ModelRenderer(this, 4, 99); //
        this.AirBoots4.setRotationPoint(-2.0F, 8.0F, 2.0F); //
        this.AirBoots4.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F); //
        
        this.WaterHelmet3 = new ModelRenderer(this, 8, 80); //
        this.WaterHelmet3.setRotationPoint(-1.0F, -2.0F, 4.0F); //
        this.WaterHelmet3.addBox(-1.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F); //
        
        this.AirBoots = new ModelRenderer(this, 4, 99); //
        this.AirBoots.setRotationPoint(-2.0F, 8.0F, -3.0F); //
        this.AirBoots.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F); //
        
        this.WaterHelmet6_1 = new ModelRenderer(this, 0, 80); //
        this.WaterHelmet6_1.setRotationPoint(0.0F, -4.0F, -5.0F); //
        this.WaterHelmet6_1.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F); //
        
        this.AirBoots3 = new ModelRenderer(this, 4, 99); //
        this.AirBoots3.setRotationPoint(-2.0F, 8.0F, 2.0F); //
        this.AirBoots3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F); //
        
        this.AirBoots2 = new ModelRenderer(this, 4, 99); //
        this.AirBoots2.setRotationPoint(-2.0F, 8.0F, -3.0F); //
        this.AirBoots2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 1, 0.0F); //
        
//        this.FireLeggings2 = new ModelRenderer(this, 1, 113); //
//        this.FireLeggings2.setRotationPoint(-2.0F, 0.0F, -2.8F); //
//        this.FireLeggings2.addBox(0.0F, 0.0F, 0.0F, 4, 8, 1, 0.0F); //
        
        this.EarthChestplate13 = new ModelRenderer(this, 42, 93); //
        this.EarthChestplate13.setRotationPoint(0.0F, 4.0F, -0.5F); //
        this.EarthChestplate13.addBox(-3.0F, -2.0F, -2.0F, 4, 6, 1, 0.0F); //
        
        this.EarthChestplate14 = new ModelRenderer(this, 42, 93); //
        this.EarthChestplate14.setRotationPoint(0.0F, 4.0F, 3.5F); //
        this.EarthChestplate14.addBox(-3.0F, -2.0F, -2.0F, 4, 6, 1, 0.0F); //
        
        this.EarthChestplate15 = new ModelRenderer(this, 42, 93); //
        this.EarthChestplate15.setRotationPoint(-0.5F, 4.0F, 0.0F); //
        this.EarthChestplate15.addBox(-3.0F, -2.0F, -2.0F, 1, 6, 4, 0.0F); //
        
        this.EarthChestplate7 = new ModelRenderer(this, 39, 100); //
        this.EarthChestplate7.setRotationPoint(0.0F, 0.0F, -1.0F); //
        this.EarthChestplate7.addBox(-3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate7, 1.5707963267948966F, 0.0F, 0.0F); //
        
        this.EarthChestplate8 = new ModelRenderer(this, 39, 100); //
        this.EarthChestplate8.setRotationPoint(0.0F, 0.0F, 4.0F); //
        this.EarthChestplate8.addBox(-3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate8, 1.5707963267948966F, 0.0F, 0.0F); //
        
        this.EarthChestplate6 = new ModelRenderer(this, 39, 93); //
        this.EarthChestplate6.setRotationPoint(-2.0F, -1.0F, 0.0F); //
        this.EarthChestplate6.addBox(-3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate6, 0.0F, 0.0F, -1.5707963267948966F); //
        
        this.EarthChestplate5 = new ModelRenderer(this, 40, 93); //
        this.EarthChestplate5.setRotationPoint(0.0F, -1.0F, 0.0F); //
        this.EarthChestplate5.addBox(-3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        
        this.EarthChestplate10 = new ModelRenderer(this, 39, 100); //
        this.EarthChestplate10.setRotationPoint(6.0F, 1.0F, -1.0F); //
        this.EarthChestplate10.addBox(-7.0F, -2.0F, -1.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate10, 1.5707963267948966F, 0.0F, 0.0F); //
        
        this.EarthChestplate11 = new ModelRenderer(this, 39, 100); //
        this.EarthChestplate11.setRotationPoint(6.0F, 2.0F, 4.0F); //
        this.EarthChestplate11.addBox(-7.0F, -2.0F, 0.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate11, 1.5707963267948966F, 0.0F, 0.0F); //
        
        this.EarthChestplate12 = new ModelRenderer(this, 40, 93); //
        this.EarthChestplate12.setRotationPoint(5.0F, -1.0F, 0.0F); //
        this.EarthChestplate12.addBox(-3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        this.setRotateAngle(EarthChestplate12, 0.0F, 0.0F, -1.5707963267948966F); //

        this.EarthChestplate9 = new ModelRenderer(this, 39, 100); //
        this.EarthChestplate9.setRotationPoint(-4.0F, -1.0F, 0.0F); //
        this.EarthChestplate9.addBox(3.0F, -2.0F, -2.0F, 4, 1, 4, 0.0F); //
        
        this.EarthChestplate = new ModelRenderer(this, 26, 93); //
        this.EarthChestplate.setRotationPoint(0.0F, 0.0F, -0.6F); //
        this.EarthChestplate.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 1, 0.0F); //
        
        this.EarthChestplate2 = new ModelRenderer(this, 25, 93); //
        this.EarthChestplate2.setRotationPoint(0.0F, 0.0F, 4.4F); //
        this.EarthChestplate2.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 1, 0.0F); //
        
        this.EarthChestplate4 = new ModelRenderer(this, 35, 85); //
        this.EarthChestplate4.setRotationPoint(-0.8F, 0.0F, 0.0F); //
        this.EarthChestplate4.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 4, 0.0F); //
        
        this.EarthChestplate3 = new ModelRenderer(this, 45, 88); //
        this.EarthChestplate3.setRotationPoint(7.2F, 0.0F, 0.0F); //
        this.EarthChestplate3.addBox(-4.0F, 0.0F, -2.0F, 1, 12, 4, 0.0F); // 
        
        this.bipedHead.addChild(WaterHelmet);
        this.bipedHead.addChild(WaterHelmet2);
        this.bipedHead.addChild(WaterHelmet3);
        this.bipedHead.addChild(WaterHelmet4);
        this.bipedHead.addChild(WaterHelmet5);
        this.bipedHead.addChild(WaterHelmet6);
        this.bipedHead.addChild(WaterHelmet6_1);
        
        this.bipedBody.addChild(EarthChestplate);
        this.bipedBody.addChild(EarthChestplate2);
        this.bipedBody.addChild(EarthChestplate3);
        this.bipedBody.addChild(EarthChestplate4);
        
        this.bipedRightArm.addChild(EarthChestplate5);
        this.bipedRightArm.addChild(EarthChestplate6);
        this.bipedRightArm.addChild(EarthChestplate7);
        this.bipedRightArm.addChild(EarthChestplate8);
        this.bipedRightArm.addChild(EarthChestplate13);
        this.bipedRightArm.addChild(EarthChestplate14);
        this.bipedRightArm.addChild(EarthChestplate15);
        
        this.bipedLeftArm.addChild(EarthChestplate9);
        this.bipedLeftArm.addChild(EarthChestplate10);
        this.bipedLeftArm.addChild(EarthChestplate11);
        this.bipedLeftArm.addChild(EarthChestplate12);
       
        this.bipedRightLeg.addChild(AirBoots);
        this.bipedRightLeg.addChild(AirBoots3);
        this.bipedRightLeg.addChild(AirBoots5);
        this.bipedRightLeg.addChild(AirBoots7);

        this.bipedLeftLeg.addChild(AirBoots2);
        this.bipedLeftLeg.addChild(AirBoots4);
        this.bipedLeftLeg.addChild(AirBoots6);
        this.bipedLeftLeg.addChild(AirBoots8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
     
    	super.render(entity, f, f1, f2, f3, f4, f5);

    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
