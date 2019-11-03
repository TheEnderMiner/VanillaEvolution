package com.evep.evepmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelChicken - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelTurkey extends ModelBase {
    public ModelRenderer RightWing;
    public ModelRenderer LeftLeg;
    public ModelRenderer LeftWing;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer RightLeg;
    public ModelRenderer Beak;
    public ModelRenderer RedHangyBit;
    public ModelRenderer TailFeather;
    public ModelRenderer TailLeft;
    public ModelRenderer TailRight;
    public ModelRenderer TailTop;
    public ModelRenderer TailTopRight;
    public ModelRenderer TailTopLeft;

    public ModelTurkey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.TailFeather = new ModelRenderer(this, 42, 20);
        this.TailFeather.setRotationPoint(-4.0F, 4.0F, 2.0F);
        this.TailFeather.addBox(0.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F);
        this.TailRight = new ModelRenderer(this, 42, 20);
        this.TailRight.setRotationPoint(4.0F, 4.0F, 3.0F);
        this.TailRight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 26, 0);
        this.LeftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.TailTopRight = new ModelRenderer(this, 43, 15);
        this.TailTopRight.setRotationPoint(-5.0F, 4.0F, 6.0F);
        this.TailTopRight.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.LeftWing = new ModelRenderer(this, 24, 13);
        this.LeftWing.setRotationPoint(4.0F, 13.0F, 0.0F);
        this.LeftWing.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.RightLeg = new ModelRenderer(this, 26, 0);
        this.RightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.RightWing = new ModelRenderer(this, 24, 13);
        this.RightWing.setRotationPoint(-4.0F, 13.0F, 0.0F);
        this.RightWing.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F);
        this.TailTop = new ModelRenderer(this, 43, 15);
        this.TailTop.setRotationPoint(-4.0F, 4.0F, 7.0F);
        this.TailTop.addBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F);
        this.TailTopLeft = new ModelRenderer(this, 43, 15);
        this.TailTopLeft.setRotationPoint(4.0F, 4.0F, 6.0F);
        this.TailTopLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.RedHangyBit = new ModelRenderer(this, 14, 4);
        this.RedHangyBit.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RedHangyBit.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
        this.Beak = new ModelRenderer(this, 14, 0);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
        this.TailLeft = new ModelRenderer(this, 42, 20);
        this.TailLeft.setRotationPoint(-5.0F, 4.0F, 3.0F);
        this.TailLeft.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.Body = new ModelRenderer(this, 0, 9);
        this.Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.Head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.Body.addChild(this.TailFeather);
        this.Body.addChild(this.TailRight);
        this.Body.addChild(this.TailTopRight);
        this.Body.addChild(this.TailTop);
        this.Body.addChild(this.TailTopLeft);
        this.Head.addChild(this.RedHangyBit);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.TailLeft);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.LeftLeg.render(f5);
        this.LeftWing.render(f5);
        this.RightLeg.render(f5);
        this.RightWing.render(f5);
        this.Body.render(f5);
        this.Head.render(f5);
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
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
