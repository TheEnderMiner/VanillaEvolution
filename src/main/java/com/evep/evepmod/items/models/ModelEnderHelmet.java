package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnderHelmet extends ModelBiped {
    public ModelRenderer HelmetTop;
    public ModelRenderer HelmetBack;
    public ModelRenderer HelmetLeftBack;
    public ModelRenderer HelmetLeftFront;
    public ModelRenderer HelmetRightBack;
    public ModelRenderer HelmetRightFront;
    public ModelRenderer HelmetFront;
    public ModelRenderer HelmetBackBottom;
    public ModelRenderer HelmetLeftHornBottom;
    public ModelRenderer HelmetRightHornBottom;

    public ModelEnderHelmet() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.HelmetTop = new ModelRenderer(this, 25, 100);
        this.HelmetTop.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.HelmetTop.addBox(-4.0F, -8.0F, -4.0F, 8, 1, 8, 0.0F);
        
        this.HelmetRightFront = new ModelRenderer(this, 25, 100);
        this.HelmetRightFront.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.HelmetRightFront.addBox(-4.0F, -8.0F, -4.0F, 1, 3, 3, 0.0F);
        
        this.HelmetFront = new ModelRenderer(this, 25, 100);
        this.HelmetFront.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.HelmetFront.addBox(-4.0F, -8.0F, -4.0F, 8, 2, 1, 0.0F);
        
        this.HelmetLeftFront = new ModelRenderer(this, 25, 100);
        this.HelmetLeftFront.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.HelmetLeftFront.addBox(-4.0F, -8.0F, -4.0F, 1, 3, 3, 0.0F);
        
        this.HelmetRightBack = new ModelRenderer(this, 25, 100);
        this.HelmetRightBack.setRotationPoint(-1.0F, 0.0F, 3.0F);
        this.HelmetRightBack.addBox(-4.0F, -8.0F, -4.0F, 1, 5, 5, 0.0F);
        
        this.HelmetLeftHornBottom = new ModelRenderer(this, 25, 100);
        this.HelmetLeftHornBottom.setRotationPoint(4.0F, -2.0F, 1.0F);
        this.HelmetLeftHornBottom.addBox(-4.0F, -8.0F, -4.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(HelmetLeftHornBottom, 0.0F, 0.0F, 0.31869712141416456F);
        
        this.HelmetRightHornBottom = new ModelRenderer(this, 25, 100);
        this.HelmetRightHornBottom.setRotationPoint(3.0F, -4.0F, 1.0F);
        this.HelmetRightHornBottom.addBox(-4.0F, -8.0F, -4.0F, 1, 2, 1, 0.0F);
        this.setRotateAngle(HelmetRightHornBottom, 0.0F, 0.0F, -0.31869712141416456F);
        
        this.HelmetBack = new ModelRenderer(this, 25, 100);
        this.HelmetBack.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.HelmetBack.addBox(-4.0F, -8.0F, -4.0F, 8, 5, 1, 0.0F);
        
        this.HelmetBackBottom = new ModelRenderer(this, 25, 100);
        this.HelmetBackBottom.setRotationPoint(3.0F, 5.0F, 8.0F);
        this.HelmetBackBottom.addBox(-4.0F, -8.0F, -4.0F, 2, 1, 1, 0.0F);
        
        this.HelmetLeftBack = new ModelRenderer(this, 25, 100);
        this.HelmetLeftBack.setRotationPoint(8.0F, 0.0F, 3.0F);
        this.HelmetLeftBack.addBox(-4.0F, -8.0F, -4.0F, 1, 5, 5, 0.0F);
        
        this.bipedHead.addChild(HelmetTop);
        this.bipedHead.addChild(HelmetBack);
        this.bipedHead.addChild(HelmetLeftBack);
        this.bipedHead.addChild(HelmetLeftFront);
        this.bipedHead.addChild(HelmetRightBack);
        this.bipedHead.addChild(HelmetRightFront);
        this.bipedHead.addChild(HelmetFront);
        this.bipedHead.addChild(HelmetBackBottom);
        this.bipedHead.addChild(HelmetLeftHornBottom);
        this.bipedHead.addChild(HelmetRightHornBottom);
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