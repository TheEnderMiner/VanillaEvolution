package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelSilverfish - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCactusBug extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Head;
    public ModelRenderer RightLeg1;
    public ModelRenderer RightLeg2;
    public ModelRenderer RightLeg3;
    public ModelRenderer RightLeg4;
    public ModelRenderer LeftLeg1;
    public ModelRenderer LeftLeg2;
    public ModelRenderer LeftLeg3;
    public ModelRenderer LeftLeg4;

    public ModelCactusBug() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightLeg3 = new ModelRenderer(this, 13, 8);
        this.RightLeg3.setRotationPoint(-1.0F, 1.0F, 4.0F);
        this.RightLeg3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.LeftLeg2 = new ModelRenderer(this, 13, 8);
        this.LeftLeg2.setRotationPoint(4.0F, 1.0F, 2.0F);
        this.LeftLeg2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.LeftLeg4 = new ModelRenderer(this, 13, 8);
        this.LeftLeg4.setRotationPoint(4.0F, 1.0F, 6.0F);
        this.LeftLeg4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.RightLeg2 = new ModelRenderer(this, 13, 8);
        this.RightLeg2.setRotationPoint(-1.0F, 1.0F, 2.0F);
        this.RightLeg2.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Body = new ModelRenderer(this, 2, 0);
        this.Body.setRotationPoint(-2.0F, 21.0F, -3.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 2, 7, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(2.0F, 0.0F, -1.0F);
        this.Head.addBox(-1.5F, 0.0F, -1.0F, 3, 2, 2, 0.0F);
        this.LeftLeg1 = new ModelRenderer(this, 13, 8);
        this.LeftLeg1.setRotationPoint(4.0F, 1.0F, 0.0F);
        this.LeftLeg1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.RightLeg1 = new ModelRenderer(this, 13, 8);
        this.RightLeg1.setRotationPoint(-1.0F, 1.0F, 0.0F);
        this.RightLeg1.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.RightLeg4 = new ModelRenderer(this, 13, 8);
        this.RightLeg4.setRotationPoint(-1.0F, 1.0F, 6.0F);
        this.RightLeg4.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.LeftLeg3 = new ModelRenderer(this, 13, 8);
        this.LeftLeg3.setRotationPoint(4.0F, 1.0F, 4.0F);
        this.LeftLeg3.addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
        this.Body.addChild(this.RightLeg3);
        this.Body.addChild(this.LeftLeg2);
        this.Body.addChild(this.LeftLeg4);
        this.Body.addChild(this.RightLeg2);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.LeftLeg1);
        this.Body.addChild(this.RightLeg1);
        this.Body.addChild(this.RightLeg4);
        this.Body.addChild(this.LeftLeg3);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Body.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    	
    	this.LeftLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LeftLeg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
