package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelIronGolem - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelDwarvenGolem extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer BodyLower;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Head;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer Nose;

    public ModelDwarvenGolem() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.LeftArm = new ModelRenderer(this, 60, 58);
        this.LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.Body = new ModelRenderer(this, 0, 40);
        this.Body.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.Body.addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F);
        this.BodyLower = new ModelRenderer(this, 0, 70);
        this.BodyLower.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BodyLower.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.0F);
        this.Nose = new ModelRenderer(this, 24, 0);
        this.Nose.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose.addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Head.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
        this.RightArm = new ModelRenderer(this, 60, 21);
        this.RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 60, 0);
        this.LeftLeg.mirror = true;
        this.LeftLeg.setRotationPoint(5.0F, 18.0F, 0.0F);
        this.LeftLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.RightLeg = new ModelRenderer(this, 37, 0);
        this.RightLeg.setRotationPoint(-4.0F, 18.0F, 0.0F);
        this.RightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.Body.addChild(this.LeftArm);
        this.Body.addChild(this.BodyLower);
        this.Head.addChild(this.Nose);
        this.Body.addChild(this.Head);
        this.Body.addChild(this.RightArm);
        this.BodyLower.addChild(this.LeftLeg);
        this.BodyLower.addChild(this.RightLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.3D, 1.3D);
        GlStateManager.translate(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GlStateManager.translate(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GlStateManager.popMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017450292F;
    	this.Head.rotateAngleX = headPitch * 0.017450292F;
    }
}
