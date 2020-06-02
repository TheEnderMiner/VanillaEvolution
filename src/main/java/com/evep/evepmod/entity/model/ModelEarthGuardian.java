package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * Earth Guardian - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelEarthGuardian extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer BackRightLeg;
    public ModelRenderer Head;
    public ModelRenderer SpineBase;
    public ModelRenderer Brow;
    public ModelRenderer SpineMiddle;
    public ModelRenderer SpineTop;

    public ModelEarthGuardian() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, -4, 0);
        this.Body.setRotationPoint(-16.0F, -17.0F, -24.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 16, 12, 24, 0.0F);
        
        this.SpineBase = new ModelRenderer(this, 0, 0);
        this.SpineBase.setRotationPoint(6.0F, -2.0F, 5.0F);
        this.SpineBase.addBox(0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F);
        
        this.SpineMiddle = new ModelRenderer(this, 0, 0);
        this.SpineMiddle.setRotationPoint(1.0F, -4.0F, 1.0F);
        this.SpineMiddle.addBox(0.0F, 0.0F, 0.0F, 2, 4, 16, 0.0F);
        
        this.Head = new ModelRenderer(this, 46, -6);
        this.Head.setRotationPoint(4.0F, -7.0F, -4.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
        
        this.Brow = new ModelRenderer(this, 52, 17);
        this.Brow.setRotationPoint(1.0F, 2.0F, -0.3F);
        this.Brow.addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
        
        this.BackLeftLeg = new ModelRenderer(this, 0, 0);
        this.BackLeftLeg.setRotationPoint(12.0F, 11.0F, 20.0F);
        this.BackLeftLeg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
        
        this.FrontLeftLeg = new ModelRenderer(this, 0, 0);
        this.FrontLeftLeg.setRotationPoint(12.0F, 11.0F, 1.0F);
        this.FrontLeftLeg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
        
        this.FrontRightLeg = new ModelRenderer(this, 0, 0);
        this.FrontRightLeg.setRotationPoint(1.0F, 11.0F, 1.0F);
        this.FrontRightLeg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
        
        this.BackRightLeg = new ModelRenderer(this, 0, 0);
        this.BackRightLeg.setRotationPoint(1.0F, 11.0F, 20.0F);
        this.BackRightLeg.addBox(0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F);
        
        this.SpineTop = new ModelRenderer(this, 0, 0);
        this.SpineTop.setRotationPoint(0.5F, -2.0F, 1.0F);
        this.SpineTop.addBox(0.0F, 0.0F, 0.0F, 1, 2, 14, 0.0F);
        
        this.Body.addChild(this.SpineBase);
        this.SpineBase.addChild(this.SpineMiddle);
        this.Body.addChild(this.Head);
        this.Head.addChild(this.Brow);
        this.Body.addChild(this.BackLeftLeg);
        this.Body.addChild(this.FrontLeftLeg);
        this.Body.addChild(this.FrontRightLeg);
        this.Body.addChild(this.BackRightLeg);
        this.SpineMiddle.addChild(this.SpineTop);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(2.0D, 2.0D, 2.0D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
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
    	this.BackLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.BackRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.FrontRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    //	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
