package biomatters;

import java.util.ArrayList;

public class Path {
	private String path;

	public Path(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void cd(String newPath) {
		int i = 0;
		String[] newPathArray = newPath.split("/");
		String[] pathArray = this.path.split("/");
		int newPathLength = newPathArray.length;

		ArrayList pathList = new ArrayList(); // this cannot be an array, since it needs to have variable size
		for (int j = 1; j < pathArray.length; j++) {
			pathList.add(pathArray[j]);
		}

		if (newPathArray[0].equals("")) {
			// absolute pathname
			pathList.clear();
			pathList.add(newPathArray[1]);
			i = i + 2;
		}

		while (i < newPathLength) {
			int k = pathList.size() - 1;
			if (newPathArray[i].equals("..")) {
				// parent directory
				pathList.remove(k);
			} else {
				// adding a child directory
				pathList.add(newPathArray[i]);
			}
			i++;
		}

		StringBuilder updatedPath = new StringBuilder();
		for (int l = 0; l < pathList.size(); l++) {
			updatedPath.append("/" + pathList.get(l));
		}

		// System.out.println(updatedPath);
		this.path = updatedPath.toString();

	}

	public static void main(String[] args) {
		Path path = new Path("/a/b/c/d");
		path.cd("x/../z");
		System.out.println(path.getPath());
	}
}
