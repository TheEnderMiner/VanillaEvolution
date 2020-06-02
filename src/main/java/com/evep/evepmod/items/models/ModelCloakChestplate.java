package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCloakChestplate - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelCloakChestplate extends ModelBiped {
    public ModelRenderer CloakBack;
    public ModelRenderer CloakLeftFlap;
    public ModelRenderer CloakRightFlap;
    public ModelRenderer CloakLeftFlapSmall;
    public ModelRenderer CloakRightFlapSmall;
    public ModelRenderer CloakFront;
    public ModelRenderer CloakLeft;
    public ModelRenderer CloakRight;
    public ModelRenderer CloakLeftArmTop;
    public ModelRenderer CloakLeftArmFront;
    public ModelRenderer CloakLeftArmBack;
    public ModelRenderer CloakLeftArmLeft;
    public ModelRenderer CloakLeftArmRight;
    public ModelRenderer CloakRightArmTop;
    public ModelRenderer CloakRightArmFront;
    public ModelRenderer CloakRightArmBack;
    public ModelRenderer CloakRightArmLeft;
    public ModelRenderer CloakRightArmRight;

    public ModelCloakChestplate() {
        this.textureWidth = 64;
        this.textureHeight = 32;
     
        this.CloakFront = new ModelRenderer(this, 15, 20);
        this.CloakFront.setRotationPoint(-4.0F, 2.0F, -3.0F);
        this.CloakFront.addBox(0.0F, 0.0F, 0.0F, 8, 10, 1, 0.0F);
        
        this.CloakLeftFlapSmall = new ModelRenderer(this, 4, 25);
        this.CloakLeftFlapSmall.setRotationPoint(1.0F, 1.0F, -3.0F);
        this.CloakLeftFlapSmall.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        
        this.CloakBack = new ModelRenderer(this, 10, 18);
        this.CloakBack.setRotationPoint(-4.0F, 0.0F, 2.0F);
        this.CloakBack.addBox(0.0F, 0.0F, 0.0F, 8, 13, 1, 0.0F);
        
        this.CloakLeftFlap = new ModelRenderer(this, 10, 18);
        this.CloakLeftFlap.setRotationPoint(2.0F, 0.0F, -3.0F);
        this.CloakLeftFlap.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        
        this.CloakRight = new ModelRenderer(this, 22, 15);
        this.CloakRight.setRotationPoint(-4.2F, 0.0F, -2.0F);
        this.CloakRight.addBox(0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F);
        
        this.CloakLeft = new ModelRenderer(this, 26, 15);
        this.CloakLeft.setRotationPoint(3.2F, 0.0F, -2.0F);
        this.CloakLeft.addBox(0.0F, 0.0F, 0.0F, 1, 13, 4, 0.0F);
        
        this.CloakRightFlapSmall = new ModelRenderer(this, 22, 30);
        this.CloakRightFlapSmall.setRotationPoint(-2.0F, 1.0F, -3.0F);
        this.CloakRightFlapSmall.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        
        this.CloakRightFlap = new ModelRenderer(this, 18, 16);
        this.CloakRightFlap.setRotationPoint(-4.0F, 0.0F, -3.0F);
        this.CloakRightFlap.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F); 
        
        this.CloakRightArmRight = new ModelRenderer(this, 22, 17);
        this.CloakRightArmRight.setRotationPoint(-4.0F, -2.0F, -2.0F);
        this.CloakRightArmRight.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakLeftArmRight = new ModelRenderer(this, 14, 17);
        this.CloakLeftArmRight.setRotationPoint(-1.2F, -2.0F, -2.0F);
        this.CloakLeftArmRight.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        										//-1.8
        
        this.CloakRightArmLeft = new ModelRenderer(this, 2, 16);
        this.CloakRightArmLeft.setRotationPoint(0.2F, -2.0F, -2.0F);
        										//1.2
        this.CloakRightArmLeft.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakLeftArmLeft = new ModelRenderer(this, 13, 17);
        this.CloakLeftArmLeft.setRotationPoint(3.0F, -2.0F, -2.0F);
        this.CloakLeftArmLeft.addBox(0.0F, 0.0F, 0.0F, 1, 11, 4, 0.0F);
        
        this.CloakLeftArmFront = new ModelRenderer(this, 10, 20);
        this.CloakLeftArmFront.setRotationPoint(-1.0F, -2.0F, -3.0F);
        this.CloakLeftArmFront.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakRightArmTop = new ModelRenderer(this, 15, 24);
        this.CloakRightArmTop.setRotationPoint(-3.0F, -3.0F, -2.0F);
        this.CloakRightArmTop.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.CloakLeftArmBack = new ModelRenderer(this, 19, 19);
        this.CloakLeftArmBack.setRotationPoint(-1.0F, -2.0F, 2.0F);
        										//4 0 2
        this.CloakLeftArmBack.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakLeftArmTop = new ModelRenderer(this, 10, 19);
        this.CloakLeftArmTop.setRotationPoint(-1.0F, -3.0F, -2.0F);
        this.CloakLeftArmTop.addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
        
        this.CloakRightArmFront = new ModelRenderer(this, 10, 16);
        this.CloakRightArmFront.setRotationPoint(-3.0F, -2.0F, -3.0F);
        this.CloakRightArmFront.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.CloakRightArmBack = new ModelRenderer(this, 16, 19);
        this.CloakRightArmBack.setRotationPoint(-3.0F, -2.0F, 2.0F);
        this.CloakRightArmBack.addBox(0.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F);
        
        this.bipedBody.addChild(CloakBack);
        this.bipedBody.addChild(CloakLeftFlap);
        this.bipedBody.addChild(CloakRightFlap);
        this.bipedBody.addChild(CloakLeftFlapSmall);
        this.bipedBody.addChild(CloakRightFlapSmall);
        this.bipedBody.addChild(CloakFront);
        this.bipedBody.addChild(CloakLeft);
        this.bipedBody.addChild(CloakRight);
        this.bipedLeftArm.addChild(CloakLeftArmTop);
        this.bipedLeftArm.addChild(CloakLeftArmFront);
        this.bipedLeftArm.addChild(CloakLeftArmBack);
        this.bipedLeftArm.addChild(CloakLeftArmLeft);
        this.bipedLeftArm.addChild(CloakLeftArmRight);
        this.bipedRightArm.addChild(CloakRightArmTop);
        this.bipedRightArm.addChild(CloakRightArmFront);
        this.bipedRightArm.addChild(CloakRightArmBack);
        this.bipedRightArm.addChild(CloakRightArmLeft);
        this.bipedRightArm.addChild(CloakRightArmRight);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
