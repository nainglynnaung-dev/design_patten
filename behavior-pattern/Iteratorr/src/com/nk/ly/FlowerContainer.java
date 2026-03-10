package com.nk.ly;

import java.util.ArrayList;
import java.util.List;

public class FlowerContainer implements IContainer{
	
	public List<String> flowers=new ArrayList();
	
	public FlowerContainer() {
		flowers.add("rose");
		flowers.add("lavendar");
	}

	@Override
	public IIterator createIterator() {
		// TODO Auto-generated method stub
		return new FlowerIterator();
	}
	
	private class FlowerIterator implements IIterator{

		@Override
		public boolean hasNext() {
			if(flowers.size()>0) {
				return true;
			}
			else {
				return false;
			}
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				String flower=flowers.get(0);
				flowers.remove(flower);
				return flower;
			}else {
				return null;
			}
		}
		
	}

}
