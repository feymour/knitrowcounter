package com.feymour.knitrowcounter.data;

import com.feymour.knitrowcounter.R;

public class Project {

	public enum Type {
		gloves(R.drawable.gloves), 
		poncho(R.drawable.poncho), 
		scarf(R.drawable.scarf),
		skirt(R.drawable.skirt),
		socks(R.drawable.socks),
		sweater(R.drawable.sweater),
		other(R.drawable.logo);
		
		private int imageId;
		
		private Type(int imageId) {
			this.imageId = imageId;
		}
		
		public int getImageId() {
			return imageId;
		}
	}
	
	
	
}
