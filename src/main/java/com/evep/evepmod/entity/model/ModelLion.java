package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelLion extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer LBLeg;
    public ModelRenderer LFLeg;
    public ModelRenderer RBLeg;
    public ModelRenderer TFLeg;
    public ModelRenderer Head;
    public ModelRenderer Mane1;
    public ModelRenderer Mane2;
    public ModelRenderer Mane3;
    public ModelRenderer Mane4;
    public ModelRenderer Mane5;
    public ModelRenderer Mane6;
    public ModelRenderer Mane7;
    public ModelRenderer Mane8;
    public ModelRenderer Mane9;
    public ModelRenderer Mane10;
    public ModelRenderer Mane11;
    public ModelRenderer Nose;

    public ModelLion() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Mane4 = new ModelRenderer(this, 12, 24);
        this.Mane4.setRotationPoint(-7.3F, 7.7F, -7.8F);
        this.Mane4.addBox(0.0F, 0.0F, -0.1F, 4, 4, 4, 0.0F);
        this.Mane7 = new ModelRenderer(this, 12, 24);
        this.Mane7.setRotationPoint(-6.4F, 14.0F, -8.8F);
        this.Mane7.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.TFLeg = new ModelRenderer(this, 0, 16);
        this.TFLeg.setRotationPoint(-3.0F, 18.0F, -5.0F);
        this.TFLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.2F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 12.0F, -7.5F);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.2F);
        this.LFLeg = new ModelRenderer(this, 0, 16);
        this.LFLeg.setRotationPoint(3.0F, 18.0F, -5.0F);
        this.LFLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.2F);
        this.Mane3 = new ModelRenderer(this, 12, 24);
        this.Mane3.setRotationPoint(-4.4F, 7.7F, -6.7F);
        this.Mane3.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.5F);
        this.Mane5 = new ModelRenderer(this, 12, 24);
        this.Mane5.setRotationPoint(-6.9F, 10.5F, -8.6F);
        this.Mane5.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Mane9 = new ModelRenderer(this, 12, 24);
        this.Mane9.setRotationPoint(-1.5F, 15.1F, -9.6F);
        this.Mane9.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Mane10 = new ModelRenderer(this, 12, 24);
        this.Mane10.setRotationPoint(1.5F, 14.0F, -9.4F);
        this.Mane10.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Mane2 = new ModelRenderer(this, 12, 24);
        this.Mane2.setRotationPoint(-2.5F, 7.6F, -8.3F);
        this.Mane2.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.6F);
        this.Mane1 = new ModelRenderer(this, 12, 24);
        this.Mane1.setRotationPoint(1.3F, 8.3F, -7.7F);
        this.Mane1.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.9F);
        this.LBLeg = new ModelRenderer(this, 0, 16);
        this.LBLeg.setRotationPoint(3.0F, 18.0F, 7.0F);
        this.LBLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.2F);
        this.Mane6 = new ModelRenderer(this, 12, 24);
        this.Mane6.setRotationPoint(-6.8F, 12.7F, -8.0F);
        this.Mane6.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Nose = new ModelRenderer(this, 16, 16);
        this.Nose.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.Nose.addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F);
        this.Body = new ModelRenderer(this, 28, 8);
        this.Body.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.Body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, 0.2F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.RBLeg = new ModelRenderer(this, 0, 16);
        this.RBLeg.setRotationPoint(-3.0F, 18.0F, 7.0F);
        this.RBLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.2F);
        this.Mane8 = new ModelRenderer(this, 12, 24);
        this.Mane8.setRotationPoint(-4.1F, 15.25F, -9.3F);
        this.Mane8.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Mane11 = new ModelRenderer(this, 12, 24);
        this.Mane11.setRotationPoint(1.9F, 12.8F, -9.2F);
        this.Mane11.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.Head.addChild(this.Nose);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Mane4.render(f5);
        this.Mane7.render(f5);
        this.TFLeg.render(f5);
        this.Head.render(f5);
        this.LFLeg.render(f5);
        this.Mane3.render(f5);
        this.Mane5.render(f5);
        this.Mane9.render(f5);
        this.Mane10.render(f5);
        this.Mane2.render(f5);
        this.Mane1.render(f5);
        this.LBLeg.render(f5);
        this.Mane6.render(f5);
        this.Body.render(f5);
        this.RBLeg.render(f5);
        this.Mane8.render(f5);
        this.Mane11.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.LBLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LFLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.RBLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.TFLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
