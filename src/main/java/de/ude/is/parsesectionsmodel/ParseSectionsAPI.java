
package de.ude.is.parsesectionsmodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ParseSectionsAPI {

    @SerializedName("parse")
    @Expose
    private Parse parse;

    public Parse getParse() {
        return parse;
    }

    public void setParse(Parse parse) {
        this.parse = parse;
    }

    public ParseSectionsAPI withParse(Parse parse) {
        this.parse = parse;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(parse).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParseSectionsAPI) == false) {
            return false;
        }
        ParseSectionsAPI rhs = ((ParseSectionsAPI) other);
        return new EqualsBuilder().append(parse, rhs.parse).isEquals();
    }

}
