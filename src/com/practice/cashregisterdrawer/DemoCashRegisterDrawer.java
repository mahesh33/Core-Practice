package com.practice.cashregisterdrawer;

public class DemoCashRegisterDrawer implements ICashRegisterDrawer {

	private DrawerStatus drawerstatus;

	public DemoCashRegisterDrawer() {
		// super();
		this.drawerstatus = DrawerStatus.Closed;
	}

	@Override
	public DrawerStatus getDrawerStatus() {

		// let's start out with a closed drawer.
		 
		return this.drawerstatus;
	}

	@Override
	public void Open() {

		this.drawerstatus = DrawerStatus.Open;
	}

	@Override
	public void Close() {

		this.drawerstatus = DrawerStatus.Closed;
	}

	@Override
	public boolean isOpen() {

		return this.drawerstatus == DrawerStatus.Open;
	}

	@Override
	public boolean isClosed() {

		return this.drawerstatus == DrawerStatus.Closed;
	}

}
