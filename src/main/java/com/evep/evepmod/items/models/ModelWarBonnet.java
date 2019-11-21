package com.evep.evepmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWarBonnet extends ModelBiped {
    public ModelRenderer Brown1;
    public ModelRenderer Brown2;
    public ModelRenderer Brown3;
    public ModelRenderer Blue1;
    public ModelRenderer Blue2;
    public ModelRenderer Blue3;
    public ModelRenderer Blue4;
    public ModelRenderer Blue5;
    public ModelRenderer White7;
    public ModelRenderer White2;
    public ModelRenderer White3;
    public ModelRenderer White4;
    public ModelRenderer White5;
    public ModelRenderer White6;
    public ModelRenderer White1;

    public ModelWarBonnet() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.Brown2 = new ModelRenderer(this, 15, 100);
        this.Brown2.setRotationPoint(7.0F, 1.0F, -1.0F);
        this.Brown2.addBox(-4.0F, -8.0F, -4.0F, 1, 5, 1, 0.0F);
        
        this.White5 = new ModelRenderer(this, 100, 100);
        this.White5.setRotationPoint(7.0F, -1.0F, 0.0F);
        this.White5.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.White1 = new ModelRenderer(this, 100, 100);
        this.White1.setRotationPoint(-2.0F, 1.0F, 0.0F);
        this.White1.addBox(-4.0F, -8.0F, -4.0F, 2, 6, 1, 0.0F);
        
        this.Blue3 = new ModelRenderer(this, 51, 100);
        this.Blue3.setRotationPoint(7.0F, 0.0F, -1.0F);
        this.Blue3.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.Blue4 = new ModelRenderer(this, 51, 100);
        this.Blue4.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.Blue4.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.White2 = new ModelRenderer(this, 100, 100);
        this.White2.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.White2.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.Blue2 = new ModelRenderer(this, 51, 100);
        this.Blue2.setRotationPoint(8.0F, 1.0F, -1.0F);
        this.Blue2.addBox(-4.0F, -8.0F, -4.0F, 1, 6, 1, 0.0F);
        
        this.Brown3 = new ModelRenderer(this, 15, 100);
        this.Brown3.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.Brown3.addBox(-4.0F, -8.0F, -4.0F, 6, 2, 1, 0.0F);
        
        this.White4 = new ModelRenderer(this, 100, 100);
        this.White4.setRotationPoint(1.0F, -2.0F, 0.0F);
        this.White4.addBox(-4.0F, -8.0F, -4.0F, 6, 2, 1, 0.0F);
        
        this.White3 = new ModelRenderer(this, 100, 100);
        this.White3.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.White3.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.White6 = new ModelRenderer(this, 100, 100);
        this.White6.setRotationPoint(8.0F, 0.0F, 0.0F);
        this.White6.addBox(-4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F);
        
        this.Brown1 = new ModelRenderer(this, 15, 100);
        this.Brown1.setRotationPoint(0.0F, 1.0F, -1.0F);
        this.Brown1.addBox(-4.0F, -8.0F, -4.0F, 1, 5, 1, 0.0F);
        
        this.Blue1 = new ModelRenderer(this, 51, 100);
        this.Blue1.setRotationPoint(-1.0F, 1.0F, -1.0F);
        this.Blue1.addBox(-4.0F, -8.0F, -4.0F, 1, 6, 1, 0.0F);
        
        this.White7 = new ModelRenderer(this, 100, 100);
        this.White7.setRotationPoint(8.0F, 1.0F, 0.0F);
        this.White7.addBox(-4.0F, -8.0F, -4.0F, 2, 6, 1, 0.0F);
        
        this.Blue5 = new ModelRenderer(this, 51, 100);
        this.Blue5.setRotationPoint(1.0F, -1.0F, -1.0F);
        this.Blue5.addBox(-4.0F, -8.0F, -4.0F, 6, 1, 1, 0.0F);
        
        this.bipedHead.addChild(Brown1);
        this.bipedHead.addChild(Brown2);
        this.bipedHead.addChild(Brown3);
        this.bipedHead.addChild(Blue1);
        this.bipedHead.addChild(Blue2);
        this.bipedHead.addChild(Blue3);
        this.bipedHead.addChild(Blue4);
        this.bipedHead.addChild(Blue5);
        this.bipedHead.addChild(White1);
        this.bipedHead.addChild(White2);
        this.bipedHead.addChild(White3);
        this.bipedHead.addChild(White4);
        this.bipedHead.addChild(White5);
        this.bipedHead.addChild(White6);
        this.bipedHead.addChild(White7);
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
