package org.vs.mbsample.dao;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;
import java.util.List;
import java.util.UUID;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by karpov on 11/20/2014.
 */
public class AaaTest {
    SqlSessionFactory sqlSessionFactory;
    @Before
    public void setUp() throws Exception {
        Reader reader = Resources.getResourceAsReader("mybatis-local-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        reader.close();
    }

    @Test
    public void testContract1() throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ContractMapper contractMapper = sqlSession.getMapper(ContractMapper.class);
            Contract contract = new Contract();
            contract.setContractNumber("QQQ");
            contractMapper.insert(contract);
            assertNotNull(contract.getId());
            sqlSession.commit();

            Contract contract1 = contractMapper.selectByPrimaryKey(contract.getId());
            assertEquals(contract.getContractNumber(),contract1.getContractNumber());

        }
    }

    @Test
    public void testContract2() throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ContractMapper contractMapper = sqlSession.getMapper(ContractMapper.class);
            String number = UUID.randomUUID().toString();

            Contract contract = new Contract();
            contract.setContractNumber(number);
            contractMapper.insert(contract);

            DeliveryStage deliveryStage = new DeliveryStage();
            deliveryStage.setContractId(contract.getId());
            deliveryStage.setName("DDD");

            contract = new Contract();
            contract.setContractNumber(number);
            contractMapper.insert(contract);

            sqlSession.commit();

            ContractExample contractExample = new ContractExample();
            contractExample.or().andContractNumberEqualTo(number);

            List<Contract> list = contractMapper.selectByExample(contractExample);
            assertEquals(2, list.size());
            assertEquals(number, list.get(0).getContractNumber());
        }
    }

    @Test
    public void testContract3() throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ContractMapper contractMapper = sqlSession.getMapper(ContractMapper.class);
            DeliveryStageMapper deliveryStageMapper = sqlSession.getMapper(DeliveryStageMapper.class);
            String number = UUID.randomUUID().toString();

            Contract contract = new Contract();
            contract.setContractNumber(number);
            contractMapper.insert(contract);

            DeliveryStage deliveryStage = new DeliveryStage();
            deliveryStage.setContractId(contract.getId());
            deliveryStage.setName("DDD1");
            deliveryStageMapper.insert(deliveryStage);

            deliveryStage = new DeliveryStage();
            deliveryStage.setContractId(contract.getId());
            deliveryStage.setName("DDD2");
            deliveryStageMapper.insert(deliveryStage);

            sqlSession.commit();

            DeliveryStageExample deliveryStageExample = new DeliveryStageExample();
            deliveryStageExample.or().andContractIdEqualTo(contract.getId());

            List<DeliveryStage> list = deliveryStageMapper.selectByExample(deliveryStageExample);
            assertEquals(2, list.size());
        }
    }

    @Test
    public void testContract4() throws Exception {
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            ContractMapper contractMapper = sqlSession.getMapper(ContractMapper.class);
            DeliveryStageMapper deliveryStageMapper = sqlSession.getMapper(DeliveryStageMapper.class);
            String number = UUID.randomUUID().toString();

            Contract contract = new Contract();
            contract.setContractNumber(number);
            contractMapper.insert(contract);

            DeliveryStage deliveryStage = new DeliveryStage();
            deliveryStage.setContractId(contract.getId());
            deliveryStage.setName("DDD1");
            deliveryStageMapper.insert(deliveryStage);

            deliveryStage = new DeliveryStage();
            deliveryStage.setContractId(contract.getId());
            deliveryStage.setName("DDD2");
            deliveryStageMapper.insert(deliveryStage);

            sqlSession.commit();

            ContractMapperU contractMapperU = sqlSession.getMapper(ContractMapperU.class);
            ContractU contractU = contractMapperU.selectContractWDeliveryStagesById(contract.getId());
            assertNotNull(contractU);

            assertEquals(2,contractU.getDeliveryStages().size());
        }
    }

//    @Test
//    public void testContract5() throws Exception {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        try {
//            ContractMapper contractMapper = sqlSession.getMapper(ContractMapper.class);
//            DeliveryStageMapper deliveryStageMapper = sqlSession.getMapper(DeliveryStageMapper.class);
//            String number = UUID.randomUUID().toString();
//
//            Contract contract = new Contract();
//            contract.setContractNumber(number);
//            contractMapper.insert(contract);
//
//            DeliveryStage deliveryStage = new DeliveryStage();
//            deliveryStage.setContractId(contract.getId());
//            deliveryStage.setName("DDD1");
//            deliveryStageMapper.insert(deliveryStage);
//
//            deliveryStage = new DeliveryStage();
//            deliveryStage.setContractId(contract.getId());
//            deliveryStage.setName("DDD2");
//            deliveryStageMapper.insert(deliveryStage);
//
//            sqlSession.commit();
//
//            ContractExample contractExample = new ContractExample();
//            contractExample.or().andContractNumberEqualTo(contract.getContractNumber());
//
//            ContractMapperU contractMapperU = sqlSession.getMapper(ContractMapperU.class);
//            List<ContractU> contracts = contractMapperU.selectContractWDeliveryStagesByExample(contractExample,null);
//            assertNotNull(contracts);
//
//            assertEquals(1,contracts.size());
//            assertEquals(2,contracts.get(0).getDeliveryStages().size());
//        }
//        finally {
//            sqlSession.close();
//        }
//    }
}
