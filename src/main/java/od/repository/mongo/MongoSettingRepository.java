package od.repository.mongo;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import od.framework.model.Setting;
import od.repository.SettingRepositoryInterface;

public interface MongoSettingRepository extends SettingRepositoryInterface, MongoRepository<Setting, String> {
}