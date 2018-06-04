package controller;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Observer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Case;
import model.Example;
import model.IDoorClosed;
import model.IDoorOpened;
import model.IEnergyBall;
import model.IHBone;
import model.ILorann;
import model.IModel;
import model.IMonster1;
import model.IMonster2;
import model.IMonster3;
import model.IMonster4;
import model.IOBone;
import model.IPurse;
import model.ISpell;
import model.IVBone;
import showboard.ISquare;

public class ImpactTest implements IModel, ILorann, IMonster1, IMonster2, IMonster3, IMonster4, ISpell, IHBone, IVBone, IOBone, IEnergyBall, IPurse, IDoorClosed, IDoorOpened{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCheckImpactILorannIMonster1(ILorann lorann, IMonster1 monster1) {
		assertNull(lorann);
		assertNotNull(monster1);
	}

	@Test
	public void testCheckImpactILorannIMonster2(ILorann lorann, IMonster2 monster2) {
		assertNull(lorann);
		assertNotNull(monster2);
	}

	@Test
	public void testCheckImpactILorannIMonster3(ILorann lorann, IMonster3 monster3) {
		assertNull(lorann);
		assertNotNull(monster3);
	}

	@Test
	public void testCheckImpactILorannIMonster4(ILorann lorann, IMonster4 monster4) {
		assertNull(lorann);
		assertNotNull(monster4);
	}

	@Test
	public void testCheckImpactILorannISpell(ILorann lorann, ISpell spell) {
		assertNull(spell);
		assertNotNull(lorann);
	}

	@Test
	public void testCheckImpactILorannIHBone(ILorann lorann, IHBone hBone) {
		assertNotNull(lorann);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactILorannIVBone(ILorann lorann, IVBone vBone) {
		assertNotNull(lorann);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactILorannIOBone(ILorann lorann, IOBone oBone) {
		assertNotNull(lorann);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactILorannIEnergyBall(ILorann lorann, IEnergyBall energyBall) {
		assertNotNull(lorann);
		assertNull(energyBall);
	}

	@Test
	public void testCheckImpactILorannIPurse(ILorann lorann, IPurse purse) {
		assertNotNull(lorann);
		assertNull(purse);
	}

	@Test
	public void testCheckImpactILorannIDoorClosed(ILorann lorann, IDoorClosed doorClosed) {
		assertNull(lorann);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactILorannIDoorOpened(ILorann lorann, IDoorOpened doorOpened) {
		assertNotNull(lorann);
		assertNull(doorOpened);
	}

	@Test
	public void testCheckImpactISpellIMonster1(ISpell spell, IMonster1 monster1) {
		assertNull(monster1);
		assertNull(spell);
	}

	@Test
	public void testCheckImpactISpellIMonster2(ISpell spell, IMonster2 monster2) {
		assertNull(monster2);
		assertNull(spell);
	}

	@Test
	public void testCheckImpactISpellIMonster3(ISpell spell, IMonster3 monster3) {
		assertNull(monster3);
		assertNull(spell);
	}

	@Test
	public void testCheckImpactISpellIMonster4(ISpell spell, IMonster4 monster4) {
		assertNull(monster4);
		assertNull(spell);
	}

	@Test
	public void testCheckImpactISpellIHBone(ISpell spell, IHBone hBone) {
		assertNotNull(spell);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactISpellIOBone(ISpell spell, IOBone oBone) {
		assertNotNull(spell);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactISpellIVBone(ISpell spell, IVBone vBone) {
		assertNotNull(spell);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactISpellIEnergyBall(ISpell spell, IEnergyBall energyBall) {
		assertNotNull(spell);
		assertNotNull(energyBall);
	}

	@Test
	public void testCheckImpactISpellIPurse(ISpell spell, IPurse purse) {
		assertNotNull(spell);
		assertNotNull(purse);
	}

	@Test
	public void testCheckImpactISpellIDoorClosed(ISpell spell, IDoorClosed doorClosed) {
		assertNotNull(spell);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactISpellIDoorOpened(ISpell spell, IDoorOpened doorOpened) {
		assertNotNull(spell);
		assertNotNull(doorOpened);
	}

	@Test
	public void testCheckImpactIMonster1IHBone(IMonster1 monster1, IHBone hBone) {
		assertNotNull(monster1);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactIMonster2IHBone(IMonster2 monster2, IHBone hBone) {
		assertNotNull(monster2);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactIMonster3IHBone(IMonster3 monster3, IHBone hBone) {
		assertNotNull(monster3);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactIMonster4IHBone(IMonster4 monster4, IHBone hBone) {
		assertNotNull(monster4);
		assertNotNull(hBone);
	}

	@Test
	public void testCheckImpactIMonster1IVBone(IMonster1 monster1, IVBone vBone) {
		assertNotNull(monster1);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactIMonster2IVBone(IMonster2 monster2, IVBone vBone) {
		assertNotNull(monster2);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactIMonster3IVBone(IMonster3 monster3, IVBone vBone) {
		assertNotNull(monster3);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactIMonster4IVBone(IMonster4 monster4, IVBone vBone) {
		assertNotNull(monster4);
		assertNotNull(vBone);
	}

	@Test
	public void testCheckImpactIMonster1IOBone(IMonster1 monster1, IOBone oBone) {
		assertNotNull(monster1);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactIMonster2IOBone(IMonster2 monster2, IOBone oBone) {
		assertNotNull(monster2);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactIMonster3IOBone(IMonster3 monster3, IOBone oBone) {
		assertNotNull(monster3);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactIMonster4IOBone(IMonster4 monster4, IOBone oBone) {
		assertNotNull(monster4);
		assertNotNull(oBone);
	}

	@Test
	public void testCheckImpactIMonster1IEnergyBall(IMonster1 monster1, IEnergyBall energyBall) {
		assertNotNull(monster1);
		assertNotNull(energyBall);
	}

	@Test
	public void testCheckImpactIMonster2IEnergyBall(IMonster2 monster2, IEnergyBall energyBall) {
		assertNotNull(monster2);
		assertNotNull(energyBall);
	}

	@Test
	public void testCheckImpactIMonster3IEnergyBall(IMonster3 monster3, IEnergyBall energyBall) {
		assertNotNull(monster3);
		assertNotNull(energyBall);
	}

	@Test
	public void testCheckImpactIMonster4IEnergyBall(IMonster4 monster4, IEnergyBall energyBall) {
		assertNotNull(monster4);
		assertNotNull(energyBall);
	}

	@Test
	public void testCheckImpactIMonster1IPurse(IMonster1 monster1, IPurse purse) {
		assertNotNull(monster1);
		assertNotNull(purse);
	}

	@Test
	public void testCheckImpactIMonster2IPurse(IMonster2 monster2, IPurse purse) {
		assertNotNull(monster2);
		assertNotNull(purse);
	}

	@Test
	public void testCheckImpactIMonster3IPurse(IMonster3 monster3, IPurse purse) {
		assertNotNull(monster3);
		assertNotNull(purse);
	}

	@Test
	public void testCheckImpactIMonster4IPurse(IMonster4 monster4, IPurse purse) {
		assertNotNull(monster4);
		assertNotNull(purse);
	}

	@Test
	public void testCheckImpactIMonster1IDoorClosed(IMonster1 monster1, IDoorClosed doorClosed) {
		assertNotNull(monster1);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactIMonster2IDoorClosed(IMonster2 monster2, IDoorClosed doorClosed) {
		assertNotNull(monster2);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactIMonster3IDoorClosed(IMonster3 monster3, IDoorClosed doorClosed) {
		assertNotNull(monster3);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactIMonster4IDoorClosed(IMonster4 monster4, IDoorClosed doorClosed) {
		assertNotNull(monster4);
		assertNotNull(doorClosed);
	}

	@Test
	public void testCheckImpactIMonster1IDoorOpened(IMonster1 monster1, IDoorOpened doorOpened) {
		assertNotNull(monster1);
		assertNotNull(doorOpened);
	}

	@Test
	public void testCheckImpactIMonster2IDoorOpened(IMonster2 monster2, IDoorOpened doorOpened) {
		assertNotNull(monster2);
		assertNotNull(doorOpened);
	}

	@Test
	public void testCheckImpactIMonster3IDoorOpened(IMonster3 monster3, IDoorOpened doorOpened) {
		assertNotNull(monster3);
		assertNotNull(doorOpened);
	}

	@Test
	public void testCheckImpactIMonster4IDoorOpened(IMonster4 monster4, IDoorOpened doorOpened) {
		assertNotNull(monster4);
		assertNotNull(doorOpened);
	}

	@Test
	public void testGetExampleById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetExampleByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllExamples() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllCasesByID() {
		fail("Not yet implemented");
	}

	@Override
	public Example getExampleById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Example getExampleByName(String name) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Example> getAllExamples() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Case> getAllCasesByID(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ISquare getOnLevel(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		
	}

}
