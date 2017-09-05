package mesosphere.marathon.client.model.v2;

import java.util.Collection;

import mesosphere.client.common.ModelUtils;

public class Group {
	private String id;
	private Collection<App> apps;
	private Collection<Group> groups;
	private Collection<String> dependencies;
	private String version;

	public Group() {
	}
	
	public Group(String id) {
		this.id = id;
	}

	public enum Embed {

		GROUPS("group.groups"),
		APPS("group.apps"),
		APPS_TASKS("group.apps.tasks"),
		APPS_COUNTS("group.apps.counts"),
		APPS_DEPLOYMENTS("group.apps.deployments"),
		APPS_READINESS("group.apps.readiness"),
		APPS_LAST_TASK_FAILURE("group.apps.lastTaskFailure"),
		APPS_TASK_STATS("group.apps.taskStats");

		private final String value;

		Embed(String value) {
			this.value = value;
		}

		public String getVaule() {
			return this.value;
		}

		@Override
		public String toString() {
			return getVaule();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Collection<App> getApps() {
		return apps;
	}

	public void setApps(Collection<App> apps) {
		this.apps = apps;
	}
	
	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	public Collection<String> getDependencies() {
		return dependencies;
	}

	public void setDependencies(Collection<String> dependencies) {
		this.dependencies = dependencies;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return ModelUtils.toString(this);
	}
}
