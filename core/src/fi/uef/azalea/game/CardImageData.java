package fi.uef.azalea.game;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import fi.uef.azalea.Statics;

public class CardImageData {
	
	public FileHandle sourceFile;
	private TextureAtlas cardAtlas;
	private TextureRegion cardTexture;

	public void setSource(FileHandle sourceFile){
		this.sourceFile = sourceFile;
	}
	
	public TextureRegion getCardTexture(){
		return cardTexture;
	}
	
	public void setCardTexture(TextureRegion cardTexture){
		
	}
	
	public TextureRegion getFullImageTexture(){
		TextureRegion original = new TextureRegion(new Texture(sourceFile));
		return original;
	}
	
	public FileHandle getSourceFile(){
		return sourceFile;
	}

	public void setTextureAtlas(TextureAtlas cardAtlas) {
		this.cardAtlas = cardAtlas;
	}
	
	/*
	public void generateCardTexture(){
		Pixmap.setBlending(Blending.None);
		Pixmap texture = new Pixmap(sourceFile);
		Pixmap cardbase = new Pixmap(PIXMAP_SIZE, PIXMAP_SIZE, Format.RGBA4444); //TODO: check performance with 8888
		
		cardbase.drawPixmap(texture, 0, 0, texture.getWidth(), texture.getHeight(), 0, 0, PIXMAP_SIZE, PIXMAP_SIZE);
		
		//TODO: do nice edges
		//cardbase.drawPixmap(StaticTextures.CARD_MASK_PIXMAP, 0, 0, StaticTextures.CARD_MASK_PIXMAP.getWidth(), StaticTextures.CARD_MASK_PIXMAP.getHeight(), 0, 0, PIXMAP_SIZE, PIXMAP_SIZE);
		
		Texture tex = new Texture(cardbase);
		tex.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		this.cardTexture = new TextureRegion(tex);
	}
	*/
	
}
