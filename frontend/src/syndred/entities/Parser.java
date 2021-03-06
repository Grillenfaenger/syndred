package syndred.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "gramma", "error", "running" })
public class Parser implements Serializable {

	@JsonProperty("name")
	private String name = "ebnf";

	@JsonProperty("gramma")
	private String gramma;

	@JsonProperty("error")
	private String error;

	@JsonProperty("running")
	private Boolean running;

	private final static long serialVersionUID = 1830572674619370572L;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("gramma")
	public String getGramma() {
		return gramma;
	}

	@JsonProperty("gramma")
	public void setGramma(String gramma) {
		this.gramma = gramma;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(String error) {
		this.error = error;
	}

	@JsonProperty("running")
	public Boolean getRunning() {
		return running;
	}

	@JsonProperty("running")
	public void setRunning(Boolean running) {
		this.running = running;
	}

}
