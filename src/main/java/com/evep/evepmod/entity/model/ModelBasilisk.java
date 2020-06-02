package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelBasilisk - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelBasilisk extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer Tail;
    public ModelRenderer NeckSpikeTop;
    public ModelRenderer NeckSpikeBottom;
    public ModelRenderer Head;
    public ModelRenderer Mouth;
    public ModelRenderer LeftHorn;
    public ModelRenderer RightHorn;

    public ModelBasilisk() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.RightHorn = new ModelRenderer(this, 34, 16);
        this.RightHorn.setRotationPoint(8.0F, -3.0F, 1.0F);
        this.RightHorn.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.Neck = new ModelRenderer(this, 42, 34);
        this.Neck.setRotationPoint(25.0F, -12.0F, -0.5F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 8, 16, 11, 0.0F);
        this.setRotateAngle(Neck, 0.0F, 0.0F, 0.6953391739945409F);
        this.Mouth = new ModelRenderer(this, 20, 0);
        this.Mouth.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.Mouth.addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
        this.setRotateAngle(Mouth, 0.0F, 0.0F, 0.17453292519943295F);
        this.NeckSpikeTop = new ModelRenderer(this, 33, 16);
        this.NeckSpikeTop.setRotationPoint(-2.0F, 3.0F, 5.0F);
        this.NeckSpikeTop.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.NeckSpikeBottom = new ModelRenderer(this, 33, 16);
        this.NeckSpikeBottom.setRotationPoint(-2.0F, 7.0F, 5.0F);
        this.NeckSpikeBottom.addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        this.Head = new ModelRenderer(this, -16, -4);
        this.Head.setRotationPoint(-3.0F, -6.5F, -0.5F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 12, 9, 12, 0.0F);
        this.setRotateAngle(Head, 0.0F, 0.0F, -0.5462880558742251F);
        this.Body = new ModelRenderer(this, -3, 22);
        this.Body.setRotationPoint(-15.0F, 0.0F, 17.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 20, 8, 10, 0.0F);
        this.setRotateAngle(Body, 0.0F, 1.5707963267948966F, 0.0F);
        this.Tail = new ModelRenderer(this, -5, 13);
        this.Tail.setRotationPoint(-13.0F, 2.0F, 2.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 13, 6, 6, 0.0F);
        this.LeftHorn = new ModelRenderer(this, 34, 16);
        this.LeftHorn.setRotationPoint(8.0F, -3.0F, 9.0F);
        this.LeftHorn.addBox(0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F);
        this.Head.addChild(this.RightHorn);
        this.Body.addChild(this.Neck);
        this.Head.addChild(this.Mouth);
        this.Neck.addChild(this.NeckSpikeTop);
        this.Neck.addChild(this.NeckSpikeBottom);
        this.Neck.addChild(this.Head);
        this.Body.addChild(this.Tail);
        this.Head.addChild(this.LeftHorn);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GlStateManager.translate(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GlStateManager.scale(3.0D, 3.0D, 3.0D);
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
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.000453292F;
    	this.Head.rotateAngleX = headPitch * 0.000453292F;
    
    }
}
