package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Lob;

public class CodeChange {
    private int changes_id;
    private int changed_id;
    private String changed_name;
    private String changed_time;
    @Lob
    @Column
    private String changed_reasons;

    @Override
    public String toString() {
        return "CodeChange{" +
                "changes_id=" + changes_id +
                ", changed_id=" + changed_id +
                ", changed_name='" + changed_name + '\'' +
                ", changed_time='" + changed_time + '\'' +
                ", changed_reasons='" + changed_reasons + '\'' +
                '}';
    }

    public int getChanges_id() {
        return changes_id;
    }

    public void setChanges_id(int changes_id) {
        this.changes_id = changes_id;
    }

    public int getChanged_id() {
        return changed_id;
    }

    public void setChanged_id(int changed_id) {
        this.changed_id = changed_id;
    }

    public String getChanged_name() {
        return changed_name;
    }

    public void setChanged_name(String changed_name) {
        this.changed_name = changed_name;
    }

    public String getChanged_time() {
        return changed_time;
    }

    public void setChanged_time(String changed_time) {
        this.changed_time = changed_time;
    }

    public String getChanged_reasons() {
        return changed_reasons;
    }

    public void setChanged_reasons(String changed_reasons) {
        this.changed_reasons = changed_reasons;
    }
}
